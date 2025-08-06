Streamify app

mutation LoginUser($data: LoginInput!) {
  loginUser(data: $data) {
    id
    email
    username
  }
}
variables: 
{
  "data": {
    "login": "testuser",
    "password": "Password123"
  }
}


redis 
host: localhost
6379
username empty
password 123456