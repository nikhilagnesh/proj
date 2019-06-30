FROM ubuntu
RUN apt-get -y update
RUN apt-get -y install git
RUN apt-get -y install openjdk-8-jdk
RUN mkdir /usr/local/tomcat
RUN git clone https://nikhil.agnesh1%40gmail.com:Nikhil%4026@github.com/nikhilagnesh/proj.git
RUN cd /proj && tar xvfz tomcat.tar.gz
RUN cp -Rv /proj/apache-tomcat-8.5.37/* /usr/local/tomcat/
RUN cd ..
RUN cp -Rv /proj/website/* /usr/local/tomcat/webapps/ROOT/
RUN rm -rf /proj
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.sh run