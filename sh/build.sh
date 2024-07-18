cd ..
mvn clean install
docker build hello-service -t killreal777/hello-service
docker build redirect-service -t killreal777/redirect-service
docker push killreal777/hello-service
docker push killreal777/redirect-service
cd sh || exit