void call() {
emailext(       attachLog: true, attachmentsPattern: 'Release_Status.csv',
                subject: "${env.JOB_NAME}: [${env.BUILD_NUMBER}]",
                to: 'vinesh.kannoth@gmail.com',               
                body: "Latest Release Status Report"
            )
}
