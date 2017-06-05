FROM java:latest

#TODO: Compile me!
#sbt universal:packageZipTarball

FROM java:latest

ADD target/universal/buletracer-1.0-SNAPSHOT.tgz /
#ADD chill_out_for_db.sh ./

#CMD ./chill_out_for_db.sh
ADD ./wait-for-postgres.sh /buletracer-1.0-SNAPSHOT/bin/wait-for-postgres.sh
WORKDIR /buletracer-1.0-SNAPSHOT/bin
#CMD ./buletracer
