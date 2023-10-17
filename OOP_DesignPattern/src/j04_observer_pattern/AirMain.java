package j04_observer_pattern;


class AirMain {

    public static void main(String[] args) {
        final int DURATION = 300;
        final int SLEEP_TIME = 10000;
        final int CLIENT_COUNT = 2;

        PollutionSubject subject = new PollutionSubject();


        // 미세먼지 농도 변경 쓰레드 실행
        AirPollutionPublisher pub = new AirPollutionPublisher(DURATION, subject);
        Thread pubThread = new Thread(pub);
        pubThread.start();
        
        AirPollutionSubscriber[] subs = new AirPollutionSubscriber[CLIENT_COUNT];
        for (int i = 0; i < CLIENT_COUNT; i++) {
            subs[i] = new AirPollutionSubscriber(i + 1);
            subject.addObserver(subs[i]);
        }


        try {
            Thread.sleep(SLEEP_TIME);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // 미세먼지 농도 변경 쓰레드 종료
        pub.stopThread();



    }
}