def call() {
    withSonarQubeEnv('sonarqube-server') {
        sh 'sonar-scanner'
    }
}
