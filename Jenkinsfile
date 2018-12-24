pipeline{
    agent any
    stages {
        stage ('download dependencies') {
            steps {
                sh 'mvn clean'
            }
        }
        stage ('compile program') {
            steps {
                sh 'mvn compile -e'
            }
        }
        stage ('run unit tests') {
            steps {
                sh 'echo RUN Unit test !'
            }
        }
    }
}
