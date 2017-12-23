(https://blog.pchudzik.com/201712/bisect-the-dragon/)[Blog post]

Run setup.sh which will install corporate pom-v1.xml and pom-v2.xml in your local repository.

Execute

```
(cd corporate && mvn -f pom-v1.xml install && mvn -f pom-v2.xml install) # or run ./setup.sh
git bisect start
git bisect bad
git bisect good 6fd3a3d
git bisect run sh -c "(cd project && mvn versions:set -DgenerateBackupPoms=false -DnewVersion=1.0.0 && git checkout -- .)"
rm -rf $HOME/.m2/repository/com/pchudzik/blog/example/corporate-dragon # or run ./cleanup.sh
```

To locate commit which breaks the build
