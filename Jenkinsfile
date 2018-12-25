pipeline{
    agent any
    stages {
        stage ('compile program') {
            steps {
                sh 'mvn clean compile -e'
            }
        }
        stage ('run unit tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
