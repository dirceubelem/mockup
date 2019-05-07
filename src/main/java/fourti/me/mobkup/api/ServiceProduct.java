package fourti.me.mobkup.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("product")
public class ServiceProduct {

    @GET
    @Produces("application/json; charset=utf-8")
    public String getProducts() {
        return "[\n" +
                "{\n" +
                "id: '0',\n" +
                "url: 'http://imagens.fastshop.com.br/imgprod/AEMN112BRADRD_G.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 4,\n" +
                "},\n" +
                "{\n" +
                "id: '1',\n" +
                "url: 'https://t.tudocdn.net/287931?w=152&h=304',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 5,\n" +
                "},\n" +
                "{\n" +
                "id: '2',\n" +
                "url:\n" +
                "'https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000sLkC7MAK/5a043df5e4b035382750a939.jpg&w=620&h=400',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 3,\n" +
                "},\n" +
                "{\n" +
                "id: '3',\n" +
                "url:\n" +
                "'https://http2.mlstatic.com/iphone-x-64gb-cinza-espacial-D_NQ_NP_739472-MLB26496748650_122017-F.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 1,\n" +
                "},\n" +
                "{\n" +
                "id: '4',\n" +
                "url:\n" +
                "'https://www.slickwraps.com/media/catalog/product/cache/1/image/580x580/9df78eab33525d08d6e5fb8d27136e95/i/p/iphone-x_combine_nc_red_1.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 4,\n" +
                "},\n" +
                "{\n" +
                "id: '5',\n" +
                "url:\n" +
                "'https://spigenshop.com.br/wp-content/uploads/2019/01/title_ipx_classic_one_02_2048x2048.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 5,\n" +
                "},\n" +
                "{\n" +
                "id: '6',\n" +
                "url:\n" +
                "'https://media.wired.com/photos/5b22c5c4b878a15e9ce80d92/master/pass/iphonex-TA.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 4,\n" +
                "},\n" +
                "{\n" +
                "id: '7',\n" +
                "url:\n" +
                "'https://cdn.macworld.co.uk/cmsdata/reviews/3685719/iphone-x-vs-xr-main_thumb800.png',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 3,\n" +
                "},\n" +
                "{\n" +
                "id: '8',\n" +
                "url:\n" +
                "'https://i0.wp.com/www.telesintese.com.br/wp-content/uploads/2018/09/iPhone_XR_yellow.jpg',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 4,\n" +
                "},\n" +
                "{\n" +
                "id: '9',\n" +
                "url:\n" +
                "'https://images.livrariasaraiva.com.br/imagemnet/imagem.aspx/?pro_id=9899919&qld=90&l=430&a=-1',\n" +
                "flag:\n" +
                "'https://iguatemi.com.br/patiohigienopolis/sites/patiohigienopolis/files/logo-1360262825940.png',\n" +
                "title: 'iPhone X Prata, Tela de 5,8”, 4G, 64 GB',\n" +
                "pontos: '584.572',\n" +
                "value: 'ou 175.372 pontos + R$ 4.387,44',\n" +
                "star: 5,\n" +
                "},\n" +
                "]";
    }

}
