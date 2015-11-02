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
 - **traverse to desired folder**     -  _cd ~_ - For homefolder
 - **clone project**                  - _git clone https://github.com/hugb-oldies/TicTacToldies.git_

 Additional git config (optional)
 - **config git**                     - _git config user.name "[Full name of user]"_ 
 - **config git**                     - _git config user.email "[Email of user]"_ 
 - **config git**                     - _nano .git/config_
 - **config git** [_remote "origin"_] section :
                            - _url = git@github.com:hugb-oldies/tictactoldies.git_

#### Adding features or editing source code
 - Pull the latest master	- _git pull_
 - Create a branch 		- _git branch yournewbranch_
 - Use TDD development and write tests immediately
 - Run all tests 	   	- _./bin/build_and_test_
 - Do your work on the new branch and commit changes
 - Create a new upstream branch - _git push -u origin yournewbranch_
 - Once completed, create a pull request

### Reviewing pull requests
 - Pull the code as requested
 - Perform a code review
 - Comment on what needs changing
 - If the feature branch is to be accepted, merge with master

#### Build environment

- Gradle

#### How to run the tests
 
- _./bin/compile - _compiles source code_
. _./bin/compile_tests - _compiles unit tests_
- _./bin/unit_test_ - _runs unit tests_
. _./bin/report_ - _generates cobertura report_
. _./bin/deploy_ - _generates and deploys a jar file to an external location and then runs it_
- _./bin/build_and_test_ - runs all the scripts above.

#### Other necessary dependencies

. _None_