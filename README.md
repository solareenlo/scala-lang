# scala-lang

## Docker で動かす
- Reference: https://github.com/hseeberger/scala-sbt

```bash
docker run -it --rm hseeberger/scala-sbt bash
docker run -it --rm hseeberger/scala-sbt scala
docker run -it --rm hseeberger/scala-sbt sbt
```

```bash
docker run -it --rm -v $(pwd):/root hseeberger/scala-sbt bash
docker run -it --rm -v $(pwd):/root solareenlo/scala-sbt bash
```
