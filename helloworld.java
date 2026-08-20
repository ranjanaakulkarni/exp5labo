pipeline{
  agent any
    stages{
    steps{
      sh 'javac helloworld.jaba'
      }
}
stage ('Run'){
  step {
    sh 'java helloworld'
    }
}
}
}
