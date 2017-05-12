FROM java:latest

#TODO: Compile me!
#sbt universal:packageZipTarball

FROM java:latest

ENV appName buletracer
ENV appVersion 1.0-SNAPSHOT
ENV appWithVersion ${appName}-${appVersion}

ADD target/universal/${appWithVersion}.tgz /
RUN chown 1000:1000 /${appWithVersion}/bin/${appName}
RUN chmod +x /${appWithVersion}/bin/${appName}

WORKDIR /${appWithVersion}/bin
CMD ./${appName} # "-Dplay.evolutions.db.default.autoApply=true"
