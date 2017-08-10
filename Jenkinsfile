#!/usr/bin/env groovy

node {
    stage ('Preparation') {
        echo 'Cloning repo...'
        //sh "git clone git@github.com:haralbl/gildedrose.git"
        git credentialsId: '91ca7d99-365c-469d-99c7-c5c254130aae', url: 'git@github.com:haralbl/gildedrose.git'
    }
    stage ('Build') {
        echo 'Build ...'
    }
    stage ('Results') {
        echo 'Hello World'
    }
}
