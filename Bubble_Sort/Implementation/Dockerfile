FROM node

WORKDIR /app

COPY . /app

RUN npm install -g nodemon

VOLUME [ "/app/node_module" ]

CMD [ "nodemon", "-L", "bubble_sort.js" ]