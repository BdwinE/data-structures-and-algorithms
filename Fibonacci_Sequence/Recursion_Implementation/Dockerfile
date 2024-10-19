FROM node

WORKDIR /app

COPY . /app

RUN npm install -g nodemon

VOLUME [ "/app/node_modules" ]

CMD [ "nodemon", "-L", "recursion_fib.js" ]