$(document).ready(function() {
    $("#inscrits").val(0);
    $("#inscrits").on('focusin', function() {
        this.value = '';
    });
    $("#inscrits").on('focusout', function() {
        if(this.value == '') {
            this.value = 0;
        }
    });

    $("#votants").val(0);
    $("#votants").on('focusin', function() {
        this.value = '';
    });
    $("#votants").on('focusout', function() {
        if(this.value == '') {
            this.value = 0;
        }
    });

    $("#blancs").val(0);
    $("#blancs").on('focusin', function() {
        this.value = '';
    });
    $("#blancs").on('focusout', function() {
        if(this.value == '') {
            this.value = 0;
        }
    });

    $("#nuls").val(0);
    $("#nuls").on('focusin', function() {
        this.value = '';
    });
    $("#nuls").on('focusout', function() {
        if(this.value == '') {
            this.value = 0;
        }
    });

    for(var i = 1; i <= $('#listesCandidates .liste label').length; i++) {
        $('#liste' + i).val(0);
        $('#liste' + i).on('focusin', function() {
            this.value = '';
        });
        $('#liste' + i).on('focusout', function() {
            if(this.value == '') {
                this.value = 0;
            }
        });
    }

    let socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
    });

    $('#envoyer').click(function() {
        var toReturn = {};

        toReturn['bureau'] = $("#bureau").val();
        toReturn['inscrits'] = $("#inscrits").val();
        toReturn['votants'] = $("#votants").val();

        for(var i = 1; i <= $('#listesCandidates .liste label').length; i++) {
            toReturn['liste' + i] = $('#liste' + i).val();
        }

        toReturn['blancs'] = $("#blancs").val();
        toReturn['nuls'] = $("#nuls").val();

        stompClient.send("/app/hello", {}, JSON.stringify(toReturn));
    });
});