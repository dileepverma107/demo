pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat './gradlew clean build'
            }
        }
         stage('Test') {
            steps {
                bat './gradlew test'
            }
         }
        stage('SonarQube Analysis') {
            steps {
                script {
                    withSonarQubeEnv(credentialsId:'sonar-token') {
                       bat './gradlew jacocoTestReport sonar --warning-mode all'
                    }
                    timeout (time: 1, unit: 'HOURS') {
                    def qg = waitForQualityGate ()
                        if (qg.status != 'OK') {
                             error "Pipeline aborted due to quality gate failure: ${qg.status}"
                           }
                      }
                }
            }
        }
    }
}
