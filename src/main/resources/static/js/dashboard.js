function pourcentage(x) {
    return (x).toFixed(2).replace(".",".") + " %"
}

function faireAnimation(cible) {
    cible.css("background-color", "#FFF59D");
    cible.animate({
        backgroundColor: "#F5F5F5"
    }, 60000 );
}

$(document).ready(function() {

    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (message) {

            console.log(message)
            var scrutin = JSON.parse(message.body);
            var total_par_liste = scrutin.total_par_liste;
            var numeroBureau = scrutin.bureau_id;

            /* BUREAU */
            var pourcentage_inscrits_bureau = pourcentage((scrutin.voix[98]*100) / scrutin.voix[99]);
            $("#b" + numeroBureau + "l99").html(scrutin.voix[99]);
            faireAnimation($("#b" + numeroBureau + "l99"));
            $("#b" + numeroBureau + "l98 .voix").html(scrutin.voix[98]);
            faireAnimation($("#b" + numeroBureau + "l98 .voix"));
            $("#b" + numeroBureau + "l98 .pourcentage").html(pourcentage_inscrits_bureau);
            faireAnimation($("#b" + numeroBureau + "l98 .pourcentage"));

            //Première passe pour le calcul du total exprimés
            var total_exprimes_bureau = 0;
            for(let [cle, valeur] of Object.entries(scrutin.voix) ) {
                if(cle > 0 && cle < 96) {
                    total_exprimes_bureau += valeur
                }
            }

            for(let [cle, valeur] of Object.entries(scrutin.voix) ) {
                if(cle > 0 && cle < 96) {
                    $("#b" + numeroBureau + "l" + cle + " .voix").html(valeur);
                    faireAnimation( $("#b" + numeroBureau + "l" + cle + " .voix"));
                    $("#b" + numeroBureau + "l" + cle + " .pourcentage").html(pourcentage((valeur * 100) / total_exprimes_bureau));
                    faireAnimation($("#b" + numeroBureau + "l" + cle + " .pourcentage"));
                }
            }

            var pourcentage_blancs_bureau = pourcentage((scrutin.voix[97]*100) / scrutin.voix[98]);
            var pourcentage_nuls_bureau = pourcentage((scrutin.voix[96]*100) / scrutin.voix[98]);

            $("#b" + numeroBureau + "l97 .voix").html(scrutin.voix[97]);
            faireAnimation($("#b" + numeroBureau + "l97 .voix"));
            $("#b" + numeroBureau + "l97 .pourcentage").html(pourcentage_blancs_bureau);
            faireAnimation($("#b" + numeroBureau + "l97 .pourcentage"));
            $("#b" + numeroBureau + "l96 .voix").html(scrutin.voix[96]);
            faireAnimation($("#b" + numeroBureau + "l96 .voix"));
            $("#b" + numeroBureau + "l96 .pourcentage").html(pourcentage_nuls_bureau);
            faireAnimation($("#b" + numeroBureau + "l96 .pourcentage"));

            /*TOTAL */
            var pourcentage_inscrits = pourcentage((total_par_liste[98]*100) / total_par_liste[99]);
            $("#t99").html(total_par_liste[99]);
            faireAnimation($("#t99"));
            $("#t98 .voix").html(total_par_liste[98]);
            faireAnimation( $("#t98 .voix"));
            $("#t98 .pourcentage").html(pourcentage_inscrits);
            faireAnimation($("#t98 .pourcentage"));

            //Première passe pour le calcul du total exprimés
            var total_exprimes = 0;
            for(let [cle, valeur] of Object.entries(total_par_liste) ) {
                if(cle > 0 && cle < 96) {
                    total_exprimes += valeur
                }
            }

            for(let [cle, valeur] of Object.entries(total_par_liste) ) {
                if(cle > 0 && cle < 96) {
                    $("#t" + cle + " .voix").html(valeur);
                    faireAnimation($("#t" + cle + " .voix"));
                    $("#t" + cle + " .pourcentage").html(pourcentage((valeur * 100) / total_exprimes));
                    faireAnimation($("#t" + cle + " .pourcentage"));
                }
            }

            var pourcentage_blancs = pourcentage((total_par_liste[97]*100) / total_par_liste[98]);
            var pourcentage_nuls = pourcentage((total_par_liste[96]*100) / total_par_liste[98]);

            $("#t97 .voix").html(total_par_liste[97]);
            faireAnimation($("#t97 .voix"));
            $("#t97 .pourcentage").html(pourcentage_blancs);
            faireAnimation( $("#t97 .pourcentage"));
            $("#t96 .voix").html(total_par_liste[96]);
            faireAnimation( $("#t96 .voix"));
            $("#t96 .pourcentage").html(pourcentage_nuls);
            faireAnimation($("#t96 .pourcentage"));

            //Mise à jour de la date
            const now = new Date()
            $('#maj').html("Mise à jour : " + now.toLocaleTimeString('fr-FR'))
        });
    });
});