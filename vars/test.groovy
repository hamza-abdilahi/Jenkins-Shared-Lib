pipeline{
    agent any()
    stages {
         tage(build) {
             steps {
                 echo 'building'
             }
         }
         stage(test) {
             steps {
                 echo 'testing something here'

             }
         }
         stage(deploy) {
             steps {
                 echo 'deploying to the cloud'
             }
         }
    }
}