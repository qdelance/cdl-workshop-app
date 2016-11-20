node {

   stage('build & unit tests') {
      echo '01'
      node('build') {
        sleep 10
      }
   }
   stage('integration tests') {
      echo '02'
      node('build') {
        sleep 10
      }
   }
   stage('acceptance test') {
      echo '03'
      node('build') {
        sleep 10
      }
      parallel chrome: {
        echo '03 - chrome'
        sleep 10
      }, edge: {
        echo '03 - edge'
        sleep 10
      },
      firefox: {
        echo '03 - ff'
        sleep 10
      },
      failFast: true
   }    
   stage('staging') {
      echo '04'
      node('ssh') {
        sleep 10
      }
   }   
   stage('manual approve') {
      echo '05'
   }
   stage('deploy') {
      echo '06'
      node('ssh') {
        sleep 10
      }      
   }
}
