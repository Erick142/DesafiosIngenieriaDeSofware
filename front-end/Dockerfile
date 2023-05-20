FROM node:19.5.0-alpine


RUN mkdir /front-end

WORKDIR /front-end

COPY package*.json ./

RUN npm install -g

COPY . .


EXPOSE 8081

CMD [ "npm","run", "serve" ]