# Reference

## Maven Command

1. mvnw

2. mvnw compile

3. mvnw clean package

4. mvnw spring-boot:run

5. mvnw clean package spring-boot:run

6. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000"

7. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=c:\data"

8. mvnw clean test


## Git command

1. git init (initial a local repo, doesn't link to remote yet)

2. <create a git remote repo>

3. git remote add origin https://github.com/<username>/<reponame>.git

4. git add * (add new/updated files to be commited into local repo)

5. git status (to check files that are going to commit into local repo)

6. git commit -m "<commit message>" (commit new/updated files to local repo)

7. git push -u origin master (create a master branch in github and push the code to github master branch)

8. <don't develop in master branch - final/latest working baseline>

9. git checkout -b develop master (clone a copy from master to develop branch locally)

10. git push -u origin develop (push from local develop branch to github develop branch)

11. git checkout develop (to switch between branches)

12. git branch -a (show all local branches and remote branch refernces)

13. git branch (show all local branches)

14. <always develop in develop branch>

15. git add *

16. git commit -m "<commit changes>"

17. git push -u origin develop (push code on local develop branch to github develop branch)

18. git checkout master

19. git merge develop (after changes in develop branch are complete without errors, in master branch, merge changes from develop branch)

20. git push -u origin master (in master branch to push merged changes from develop branch to github master branch)

##Deploy to heroku (must be on master branch locally and remote)
1. Create/use an existing heroku account

2. On your project root, you need a system.properties file.

3. put the following line in system.properties files.
java.runtime.version=18

4. git add *

5. git commit -m "added/updated system.properties"

6. git push -u origin master

7. heroku login (in your terminal window/command prompt in the project root directory)

8. heroku apps:create

9. git remote -v (all remote branches. you should see refernce URL to heroku)

10. git push -u heroku master


## Git reset reference
https://www.w3docs.com/learn-git/git-reset.html

echo 'new file content' > test_file

echo 'append content' >> edited_file

git add test_file edited_file

git status

git ls-files -s

git reset HEAD

git add test_file edited_file

git commit -m "added test_file edited_file"

git log

git reset --soft xxxxxxxxxxx

git reset --hard

## Tagging
https://initialcommit.com/blog/git-tag#:~:text=A%20tag%20is%20technically%20a%20type%20of%20ref,git%20tag%20v1.0.0%20%24%20git%20tag%20--list%20v1.0.0

git tag -a v1.0.0

git tag --list

git push --tags

git ls-remote --tags

EPAT Aug19