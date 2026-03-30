def call( String DockerHubUser, String ImageName, String ImageTag){
  echo 'Image build started'
  sh 'docker build -t ${DockerHubUser}/${ImageName}:${ImageTag}'
  echo 'Image build successful'
}
