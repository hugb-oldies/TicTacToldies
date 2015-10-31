## Development Manual for TicTacToe

#### What is needed and how to get the project to build on a fresh machine

- Source control client and access to source control

 - Git is used for source control 
	 
- What is needed on a linux machine to get the git client?

 - You need Java program, check which version you have:

   _which java_

 - if nothing is returned, you´ll need to install it:
   
    _sudo apt-get update_

    _sudo apt-get install openjdk-7-jdk_	

URL to this repository is https://github.com/hugb-oldies/TicTacToldies.git

#### Command to clone this repository onto a developer machine:
 - move to root folder      - _cd ~_
 - create initial directory - _mkdir TicTacToe_
 - move to new directory    - _cd TicTacToe_
 - clone project            - _git clone https://github.com/hugb-oldies/TicTacToldies.git_
 - config git               - _git config user.name "[Full name of user]"_ 
 - config git               - _git config user.email "[Email of user]"_ 
 - config git               - _nano .git/config_
 - config git [_remote "origin"_] section :
                            - _url = git@github.com:hugb-oldies/tictactoldies.git_

#### Build environment

- Gradle

#### How to run the tests
 
- _./build_and_test_

- _./comile tests_

- _./unit_test_

#### Other necessary dependencies

