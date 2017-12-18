Run setup.sh which will install corporate pom-v1.xml and pom-v2.xml in your local repository.

Execute

```
git bisect start
git bisect bad
git bisect good 6fd3a3d
git bisect run sh -c "(cd project && mvn versions:set -DgenerateBackupPoms=false -DnewVersion=1.0.0 && git checkout -- .)"
```

To locate commit which breaks the build
