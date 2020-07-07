sudo -u root docker pull raoyi1993/nginx:0.4
sudo -u root docker pull raoyi1993/crazy-blog:0.2
sudo -u root docker pull mysql:5.6
sudo -u root docker run -d -v /var/lib/mysql:/var/lib/mysql --name mysqldb -e MYSQL_ROOT_PASSWORD=mysql123 -p 3306:3306 -d mysql:5.6
sudo -u root docker run -d -p 8080:8080 -v /upload:/app/resources/upload -v /backup:/upload --name myblog raoyi1993/crazy-blog:0.2
sudo -u root docker run --name myng -d -p 80:80 -v /upload:/app/resources/upload -v /backup:/upload raoyi1993/nginx:0.4
