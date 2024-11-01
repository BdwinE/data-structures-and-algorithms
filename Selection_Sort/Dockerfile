FROM bitnami/java

WORKDIR /app

COPY . /app/

RUN javac SelectionSort.java

CMD [ "java", "SelectionSort" ]