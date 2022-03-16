const app =new Vue({
    el:"#main",
    data:{

        picPaths:{},

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
            this.flagses="true"
    fetch("/getthemepath")
    .then(res=>res.json())
    .then(json=>{
    this.picPaths=json
    })
        },
    }
})
app.use(ElementPlus);


