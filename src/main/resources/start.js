use spring_data;

use admin;

db.createUser({
    user: "spring_user",
    pwd: "qwerty",
    roles: [{ role: "readWrite", db: "spring_data" }]
    })