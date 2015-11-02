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
 - **traverse to desired folder**     -  for home folder: _cd ~_
 - **clone project**                  - _git clone https://github.com/hugb-oldies/TicTacToldies.git_
 - **config git**                     - _git config user.name "[Full name of user]"_ 
 - **config git**                     - _git config user.email "[Email of user]"_ 
 - **config git**                     - _nano .git/config_
 - **config git** [_remote "origin"_] section :
                            - _url = git@github.com:hugb-oldies/tictactoldies.git_

#### Build environment

- Gradle

#### How to run the tests
 
- _./bin/build_and_test_ - runs all tests
- _./bin/compile - _compiles source code_
. _./bin/compile_tests - _compiles uni tests_
- _./bin/unit_test_ - _runs unit tests_
. _./bin/report_ - _generates cobertura report_
. _./bin/deploy_ - _generates and deploys a jar file to an external location and then runs it_

#### Other necessary dependencies

. _None_