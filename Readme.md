# Accaessecappa
## Spring boot version

This is a simple example of a REST server returning the words for the HSK level 1 exam.
As I am going through the book Spring Microservices in action I've added a docker image building maven plugin.
On my Windows 10 notebook I have Docker toolbox installed, and to test the building phase I have to setup manually these e
environment variables:

    set DOCKER_HOST=tcp://192.168.99.100:2376
    set DOCKER_MACHINE_NAME=default
    set DOCKER_TLS_VERIFY=1
    set DOCKER_TOOLBOX_INSTALL_PATH=C:\Program Files\Docker Toolbox
    set DOCKER_CERT_PATH=C:\Users\nik\.docker\machine\machines\default



