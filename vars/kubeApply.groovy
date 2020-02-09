def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_DEPLOY}"

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "kubectl apply -f ${manifest}", returnStdout:true).trim()
    }
  }
}