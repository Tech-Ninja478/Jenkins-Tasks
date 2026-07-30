@Library('Calculator-Shared-Library') _

pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Tech-Ninja478/Jenkins-Tasks.git'
            }
        }

        stage('Build') {
            steps {
                buildApp()
            }
        }

        stage('Test') {
            steps {
                testApp()
            }
        }
    }

    post {
        success {
            norifyBuild('Build Successfull')
        }
    }
}
