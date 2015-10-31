## Development Manual for TicTacToe

#### What is needed and how to get the project to build on a fresh machine

- Source control client and access to source control

 - Git is used for source control 
	 
- What is needed on a linux machine to get the git client?

 - You need Java program 

   Check which version you have:

   _which java_

   If nothing is returned, you´ll need to install it:
   
   _sudo apt-get update_

   _sudo apt-get install openjdk-7-jdk_	

URL to repo is https://github.com/hugb-oldies/TicTacToldies.git

#### Command to clone repo onto developer machine :
 - move to root folder      - cd ~
 - create initial directory - mkdir TicTacToe
 - move to new directory    - cd TicTacToe
 - clone project            - git clone https://github.com/hugb-oldies/TicTacToldies.git
 - config git               - git config user.name "[_Full name of user_]" 
 - config git               - git config user.email "[_Email of user_]" 
 - config git               - nano .git/config
 - config git [_remote "origin"_] section :
                            - url = git@github.com:hugb-oldies/tictactoldies.git


- Build environment

- Other necessary dependencies

