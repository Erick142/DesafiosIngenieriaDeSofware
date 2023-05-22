FROM node:19.5.0-alpine


RUN mkdir /front-end

WORKDIR /front-end

COPY package*.json ./

RUN npm install -g

RUN npm i bootstrap@5.3.0-alpha3
RUN npm install axios

COPY . .


EXPOSE 8081

CMD [ "npm","run", "serve" ]