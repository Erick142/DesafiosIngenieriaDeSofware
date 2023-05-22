<template>
  <div class="container-fluid">
    <div class="row my-3">
      <div class="col-lg-4 col-12">
        <div class="row">
          <div class="col-9">
            <div class="form-floating">
              <input id="imputCantidad" class="form-control" type="number" min="0" required
                placeholder="Cantidad de autos a generar" v-model="cantidad">
              <label for="imputCantidad">Cantidad de autos a generar</label>
            </div>
          </div>
          <div class="col-3 d-flex align-items-center">
            <button class="btn btn-primary" v-on:click="peticion">Generar</button>
          </div>
        </div>
      </div>
      <div class="col-lg-8 col-12">
        <div class="row row-cols-1 row-cols-md-3">
          <div class="col">
            <div class="form-floating">
              <input id="precio" class="form-control" type="number" min="0" required
                placeholder="Cantidad de autos a generar" v-model="filtro.precio">
              <label for="precio">precio menor o igual a</label>
            </div>
          </div>
          <div class="col">
            <div class="form-floating">
              <select id="tipo" class="form-control" required placeholder="Tipo" v-model="filtro.tipo">
                <option value="" selected>seleccionar</option>
                <option value="Sedan">Sedan</option>
                <option value="camioneta">camioneta</option>
                <option value="suv">SUV</option>
              </select>
              <label for="tipo">Tipo</label>
            </div>
          </div>
          <div class="col">
            <div class="form-floating">
              <select id="color" class="form-control" required placeholder="Color" v-model="filtro.color">
                <option value="" selected>seleccionar</option>
                <option value="rojo">rojo</option>
                <option value="negro">negro</option>
                <option value="blanco">blanco</option>
                <option value="gris">gris</option>
                <option value="plata">plata</option>
              </select>
              <label for="color">Color</label>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container-md">
    <table class="table table-striped table-responsive">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Marca</th>
          <th scope="col">Año</th>
          <th scope="col">Color</th>
          <th scope="col">Precio</th>
          <th scope="col">Turbo</th>
          <th scope="col">Tipo</th>
          <th scope="col">Motor</th>
          <th scope="col">Cabinas</th>
          <th scope="col">Sunroof</th>
          <th scope="col">Popularidad</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="auto in filtrarAutos" :key="auto.id">
          <th scope="row">{{ auto.id }}</th>
          <td>{{ auto.marca }}</td>
          <td>{{ auto.año }}</td>
          <td>{{ auto.color }}</td>
          <td>{{ auto.precio }}</td>
          <td>{{ auto.turbo }}</td>
          <td>{{ auto.tipo }}</td>
          <td>{{ auto.motor }}</td>
          <td>{{ auto.cabina }}</td>
          <td>{{ auto.sunroof }}</td>
          <td>{{ auto.popularidad }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'App',
  data(){
    return{
      autos:[
        {
          id:1,marca:'lol',año: 2022,color:'negro', precio: 200, turbo: 'si', tipo: 'Sedan', motor: 'motor xd', cabina: '2', sunroof:2,popularidad:10
        },
        {
          id:2,marca:'a',año: 2022,color:'gris', precio: 300, turbo: 'si', tipo: 'camioneta', motor: 'motor xd', cabina: '2', sunroof:2,popularidad:10
        },
        {
          id:3,marca:'a',año: 2022,color:'negro', precio: 400, turbo: 'si', tipo: 'camioneta', motor: 'motor xd', cabina: '2', sunroof:2,popularidad:10
        }
      ],
      filtro:{precio:0,tipo:"",color:""},
      cantidad:0
    }
  },
  computed:{
    filtrarAutos(){
      const {precio, tipo, color}=this.filtro;
      return this.autos.filter(auto=>{
        if (precio!=0){
          if(auto.precio>precio) return false;
        }
        if (tipo!=""){
          if (tipo!==auto.tipo)  return false;
        } 
        if (color!=""){
          if(color!==auto.color) return false;
        }
        return true;
      })
    }
  },
  methods:{
    async peticion(){
      await axios.post("url/"+this.cantidad)
      .then(respuesta=>{
        console.log(respuesta.data);
      })
      .catch(error=>{
        console.log(error)
      })
    }
  }
}
</script>

<style>
</style>
