def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_BUILD}"
  def image = sh(script: "cat image_version", returnStdout: true).trim() as String

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "docker build -t arielccardoso/${image} .", returnStdout:true).trim()
      args.steps.sh(script: "docker push arielccardoso/${image}", returnStdout:true).trim()
    }
  }
}