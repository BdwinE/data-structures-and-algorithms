FROM bitnami/java

WORKDIR /app

COPY . /app/

RUN javac CounterSort.java

CMD [ "java", "CounterSort" ]