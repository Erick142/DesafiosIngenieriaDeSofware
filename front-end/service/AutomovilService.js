import axios from "axios";

export default class AutomovilService{
	url = "https://localhost/8080/api/"
	getListado(){
		return axios.get(this.url + "listado")
	}


}