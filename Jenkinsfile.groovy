pipeline {
    agent { docker { image 'hello-world:latest' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
