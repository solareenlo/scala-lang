# scala

## Docker で動かす
- Reference: https://github.com/hseeberger/scala-sbt

```bash
docker run -it --rm hseeberger/scala-sbt bash
docker run -it --rm hseeberger/scala-sbt scala
docker run -it --rm hseeberger/scala-sbt sbt
```

```bash
docker run -it --rm -v $(PWD):/root hseeberger/scala-sbt bash
```
