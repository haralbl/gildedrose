#!/usr/bin/env groovy

node {
    stage ('Preparation') {
        echo 'Cloning repo...'
        git credentialsId: '91ca7d99-365c-469d-99c7-c5c254130aae', url: 'git@github.com:haralbl/gildedrose.git'
    }
    stage ('Build') {
        sh 'docker run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn install'
    }
    stage ('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts '**/target/*.jar'
    }
    stage ('Javadoc') {
        sh 'docker run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn site'
        archive '**/target/site/*'
        archive '**/target/gildedrose-*.jar'
    }
}
