FROM bitnami/java

WORKDIR /app

COPY . /app/

RUN javac InsertionSort.java

CMD [ "java", "InsertionSort" ]