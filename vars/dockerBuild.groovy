def call(args) {

  def dir = "${WORKSPACE}"
  def slave = "${SLAVE_BUILD}"

  def image = def disk_size = sh(script: "cat image_version", returnStdout: true).trim() as String

  steps.container("${slave}"){
    steps.dir("${dir}"){
      args.steps.sh(script: "docker build -t $image .", returnStdout:true).trim()
      args.steps.sh(script: "docker push $image", returnStdout:true).trim()
    }
  }
}