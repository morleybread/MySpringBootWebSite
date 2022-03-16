    const app=Vue.createApp({
       data(){
           return {
               message:'hello',
               picPaths:{},
               flagses:true,
               flagejos:null,
               flagsfeed:null,
               morel:null,
          }

       },

       created(){
       this.getAndroid()
     },
  methods:{
               res:function (){
                   const a=Array.from(this.message).reverse().join("")
                   this.message=a
               },
               getAndroid:function (){
                   this.flagses=true
           fetch("/getthemepath")
           .then(res=>res.json())
           .then(json=>{
           this.picPaths=json

           })

               },

       //        getDesktop:function (){
       //            this.flagses="true"
       //            fetch("http://127.0.0.1:3000/desktoptheme")
       //                .then(res=>res.json())
       //                .then(json=>{
       //                       this.picPaths=json
       //                       console.log(this.picPaths)
       //
       //        })},
               getjoinus:function (){
                   this.flagses=false
                   this.flagejos=true
                   this.flagsfeed=false
                   this.morel=false
               },
               getFeedback:function () {
                this.flagses=false
                this.flagejos=false
                this.flagsfeed=true
                this.morel=false
                               },
               getMore:function (){
                   this.flagses=false
                   this.flagejos=false
                   this.flagsfeed=false
                   this.morel=true
               },
           }
    })

      app.use(ElementPlus);
      app.mount("#app");
