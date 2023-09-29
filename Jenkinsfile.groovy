pipeline {
    agent any
    stages {
        stage('Checkout and Pull') {
            steps {
                script {
                    // Navigirajte do direktorijuma sa vašim Git repozitorijumom
                    dir('C:\\Users\\Nevena\\Documents\\Ranorex\\RanorexStudio Projects\\MyTest') {

                        // Povucite najnovije promene sa udaljenog repozitorijuma
                        bat 'git pull'
                    }
                }
            }
        }

        stage('Run UFT Scenario') {
            steps {
                powershell '''
                    cd "C:\\Users\\Nevena\\Documents\\Ranorex\\RanorexStudio Projects\\MyTest\\MyTest\\bin\\Debug"
                    .\\MyTest.exe
                   
                '''
            }
        }

 

    }
}
