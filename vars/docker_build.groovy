def call(String DockerUserName, String ImageName, String ImageTag){
  echo 'Image build started'
  sh "docker build -t ${DockerUserName}/${ImageName}:${ImageTag} ."
  echo 'Image build successful'
}
