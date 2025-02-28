FROM openjdk:17

# 作業ディレクトリを設定
WORKDIR /srv/app

# 必要なパッケージ（xargsも含む）をインストール
RUN microdnf install findutils util-linux

# ソースコードをコピー
COPY server/app /srv/app

# gradlew に実行権限を付与
RUN chmod +x /srv/app/gradlew && ls -l /srv/app/gradlew
