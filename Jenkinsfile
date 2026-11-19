
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Getting source code from GitHub'
            }
        }

        stage('Build and Test') {
            steps {
                sh '"/Applications/IntelliJ IDEA.app/Contents/plugins/maven/lib/maven3/bin/mvn" clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
