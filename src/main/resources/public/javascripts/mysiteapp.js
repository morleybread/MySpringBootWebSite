const app =new Vue({
    el:"#main",
    data:{
        message:'hello',
        picPaths:{},
        flagses:"true",
        flagejos:"",
        flagsfeed:"",
        morel:"",
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
    fetch("http://127.0.0.1:8888/getthemepath")
    .then(res=>res.json())
    .then(json=>{
    this.picPaths=json
        console.log( this.picPaths[0].picPath)
    })

        },
        getDesktop:function (){
            this.flagses="true"
            fetch("http://127.0.0.1:3000/desktoptheme")
                .then(res=>res.json())
                .then(json=>{
                       this.picPaths=json
                       console.log(this.picPaths)

        })},
        getjoinus:function (){
            this.flagses="false"
            this.flagejos="true"
            this.flagsfeed="false"
            this.morel="false"



        },
        getFeedback:function () {
         this.flagses="false"

            this.flagejos="false"
            this.flagsfeed="true"
            this.morel="false"


        },

        getMore:function (){
            this.flagses="false"

            this.flagejos="false"
            this.flagsfeed="false"
            this.morel="true"

        },


    }
})

