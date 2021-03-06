data {
  int n;
  vector[n] height;
  vector[n] weight_s;
  vector[n] weight_s2;
  real a_mean;
  real<lower = 0.0> a_scale;
  vector[2] b_mean;
  vector<lower = 0.0>[2] b_scale;
  real<lower = 0.0> sigma_scale;
}
parameters {
  real a;
  vector[2] b;
  real<lower = 0.0> sigma;
}
transformed parameters {
  vector[n] mu;
  mu = a + b[1] * weight_s + b[2] * weight_s2;
}
model {
  b ~ normal(b_mean, b_scale);
  a ~ normal(a_mean, b_scale);
  sigma ~ cauchy(0.0, sigma_scale);
  height ~ normal(mu, sigma);
}
